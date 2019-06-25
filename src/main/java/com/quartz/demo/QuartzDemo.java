package com.quartz.demo;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author 皇甫
 */
public class QuartzDemo implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("纯净版Quartz");
    }
}


//玩
class test11{
    public static void main(String[] args) {
        JFrame f = new JFrame("测试标题");
        f.setSize(400,600);
        f.setLocation(500,50);
        Button button = new Button("1");
        Button button1 = new Button("2");
        f.add(button);
        f.add(button1);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }


}
