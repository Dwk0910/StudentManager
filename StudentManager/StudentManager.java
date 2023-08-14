package StudentManager;

import java.awt.*;
import javax.swing.*;

public class StudentManager extends JFrame {
    public StudentManager() {
        setTitle("학생 관리 프로그램 v1.0.0");

        /* == EVENTS == */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);

        this.init();

        setVisible(true);
    }

    public void init() {
        // 연결 정보 출력

        boolean isConnected = false;
        Container connection_info = getContentPane();
        connection_info.setLayout(new FlowLayout(FlowLayout.LEFT));

        // connection check

        connection_info.add(new JLabel("현재상태 : "));
        if (isConnected) { }
        else {
            JLabel connection_info_info = new JLabel("연결이 되지 않았습니다");
            JButton connection_info_btn = new JButton("연결하기");
            connection_info_info.setForeground(Color.RED);
            connection_info.add(connection_info_info);
            connection_info.add(connection_info_btn);
        }

        // 학생 정보 출력

        JList student_list = new JList();
    }
}