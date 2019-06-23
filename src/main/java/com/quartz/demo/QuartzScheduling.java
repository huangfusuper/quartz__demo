package com.quartz.demo;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;


/**
 * @author 皇甫
 */
public class QuartzScheduling {
    public static void main(String[] args) throws SchedulerException {
        /*JobDetailImpl jobDetail = new JobDetailImpl();
        jobDetail.setName("job1");
        jobDetail.setGroup("group1");*/
        JobDetail build = JobBuilder.newJob(QuartzDemo.class).withIdentity("job1", "group1").build();



        //CronTrigger cronTrigger = new CronTriggerImpl();
        CronTrigger tri = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1")
                .withSchedule(CronScheduleBuilder.cronSchedule("0/1 * * * * ?")).build();

        //注册到调度器
        //定义一个调度器
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        scheduler.scheduleJob(build, tri);
        scheduler.start();
    }
}
