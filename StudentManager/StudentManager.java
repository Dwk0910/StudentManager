package StudentManager;

import java.awt.*;
import javax.swing.*;

public class StudentManager extends JFrame {
    public StudentManager() {
        setTitle("StudentManager v1.0.0");

        /* == EVENTS == */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setLocation(300, 300);
        setSize(850, 620);
        setResizable(true);

        this.init();

        setVisible(true);
    }

    public void init() {
        // 연결 정보 출력
        boolean connected = false;
        JPanel connection_info_panel = new JPanel();

        connection_info_panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        connection_info_panel.setPreferredSize(new Dimension(300, 20));
        connection_info_panel.add(new JLabel("연결 정보 : "));
        if (connected) { } else {
            JLabel connection_info_label = new JLabel("연결되지 않았습니다");
            connection_info_label.setForeground(Color.RED);
            connection_info_panel.add(connection_info_label);
        }

        add(connection_info_panel);

        // Print Release
        JPanel release = new JPanel();
        release.setLayout(new FlowLayout(FlowLayout.RIGHT));
        release.setPreferredSize(new Dimension(480, 20));

        release.add(new JLabel("Version 1.0.0"));
        add(release);

        // 학생 리스트 출력
        String[] student_list_array = {"Hello1", "Hello2"};
        JPanel student_list_panel = new JPanel();
        JList<String> student_list = new JList<>(student_list_array);

        student_list.setPreferredSize(new Dimension(500, 500));

        student_list_panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        student_list_panel.setPreferredSize(new Dimension(500, 500));
        student_list_panel.add(student_list);

        add(student_list_panel);

        // ControlBox 출력
        JPanel ControlBox = new JPanel();

        ControlBox.setPreferredSize(new Dimension(280, 500));
        Dimension ControlBox_btn_size = new Dimension(275, 42);

        /* BUTTONS */
        JButton student_add = new JButton("학생 추가");
        JButton student_edit = new JButton("학생정보 편집");
        JButton student_remove = new JButton("학생 제거");
        JButton student_import = new JButton("학생 불러오기");
        JButton import_class = new JButton("반 열기");
        JButton save_class = new JButton("반 저장");
        JButton edit_class = new JButton("반 편집");
        JButton save_as_class = new JButton("다른 이름으로 반 저장");
        JButton help = new JButton("도움말");

        student_add.setPreferredSize(ControlBox_btn_size);
        student_edit.setPreferredSize(ControlBox_btn_size);
        student_remove.setPreferredSize(ControlBox_btn_size);
        student_import.setPreferredSize(ControlBox_btn_size);
        save_class.setPreferredSize(ControlBox_btn_size);
        save_as_class.setPreferredSize(ControlBox_btn_size);
        edit_class.setPreferredSize(ControlBox_btn_size);
        import_class.setPreferredSize(ControlBox_btn_size);
        help.setPreferredSize(ControlBox_btn_size);

        ControlBox.add(student_add);
        ControlBox.add(student_edit);
        ControlBox.add(student_remove);
        ControlBox.add(student_import);
        ControlBox.add(save_class);
        ControlBox.add(save_as_class);
        ControlBox.add(edit_class);
        ControlBox.add(import_class);
        ControlBox.add(help);

        add(ControlBox);

        // Print License
        JPanel License = new JPanel();
        License.setLayout(new FlowLayout(FlowLayout.CENTER));
        License.setPreferredSize(new Dimension(780, 20));

        JLabel LicenseLabel = new JLabel("Copyright 2023. Dwk0910, Taeeun All rights reserved.");
        LicenseLabel.setForeground(Color.GRAY);
        LicenseLabel.setFont(new Font(LicenseLabel.getFont().getName(), Font.ITALIC, LicenseLabel.getFont().getSize()));

        License.add(LicenseLabel);
        add(License);
    }
}