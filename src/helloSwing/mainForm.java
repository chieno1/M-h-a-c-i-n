/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package helloSwing;

/**
 *
 * @author Tranh
 */
import java.util.*;
import javax.swing.SwingConstants;

public class mainForm extends javax.swing.JFrame {

    /**
     * Creates new form mainForm
     */
    public mainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        cbo_list_item = new javax.swing.JComboBox<>();
        btn_ma_hoa = new javax.swing.JButton();
        btn_giai_ma = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        txt_input = new javax.swing.JTextField();
        txt_output = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        txt_key = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_matrix_key = new java.awt.TextArea();

        jLabel1.setText("jLabel1");

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mã hóa cổ điển_Chiến dz");

        cbo_list_item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã hóa Ceasar", "Mã hóa Đơn bảng", "Mã hóa Vigenere", "Mã hóa PlayFair", "Mã hóa Hill", "Mã hóa Affine", "Mã hóa Hàng" }));
        cbo_list_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_list_itemActionPerformed(evt);
            }
        });

        btn_ma_hoa.setText("Mã hóa");
        btn_ma_hoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ma_hoaActionPerformed(evt);
            }
        });

        btn_giai_ma.setText("Giải Mã");
        btn_giai_ma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giai_maActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        txt_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inputActionPerformed(evt);
            }
        });

        txt_output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_outputActionPerformed(evt);
            }
        });

        label2.setText("input");

        label3.setText("output");

        txt_key.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_keyActionPerformed(evt);
            }
        });

        jLabel2.setText("key");

        jLabel3.setText("matrix key");

        txt_matrix_key.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_matrix_key.setRows(3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbo_list_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_giai_ma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ma_hoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_output, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_matrix_key, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_input)
                            .addComponent(txt_key))))
                .addGap(16, 16, 16))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_clear, btn_giai_ma, btn_ma_hoa, cbo_list_item});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {label2, label3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbo_list_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ma_hoa)
                    .addComponent(txt_key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_giai_ma)
                        .addComponent(txt_output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_clear)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_matrix_key, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        txt_matrix_key.getAccessibleContext().setAccessibleName("");
        txt_matrix_key.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static int[] findPosition(char c, char[][] matrix) {
        if (c == 'J') {
            c = 'I';
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == c) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[][] mod(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] %= 26;
            }
        }
        return A;
    }

    public static int[][] invertMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] inverse = new int[n][n];

        if (n == 2) {
            int det = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
            if (det == 0) {
                throw new IllegalArgumentException("Ma trận không có ma trận nghịch đảo.");
            }
            // Tính ma trận nghịch đảo cho ma trận 2x2
            inverse[0][0] = (matrix[1][1] * modInverse(det, 26)) % 26;
            inverse[0][1] = (-matrix[0][1] * modInverse(det, 26)) % 26;
            inverse[1][0] = (-matrix[1][0] * modInverse(det, 26)) % 26;
            inverse[1][1] = (matrix[0][0] * modInverse(det, 26)) % 26;

        } else if (n == 3) {
            // Tính định thức cho ma trận 3x3
            int det = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                    - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                    + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);

            if (det == 0) {
                throw new IllegalArgumentException("Ma trận không có ma trận nghịch đảo.");
            }

            // Tính toán ma trận nghịch đảo
            int invDet = modInverse(det, 26); // Tính nghịch đảo của định thức

            // Tính ma trận phụ và nhân với nghịch đảo của định thức
            inverse[0][0] = (invDet * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])) % 26;
            inverse[0][1] = (invDet * (-matrix[1][0] * matrix[2][2] + matrix[1][2] * matrix[2][0])) % 26;
            inverse[0][2] = (invDet * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0])) % 26;

            inverse[1][0] = (invDet * (-matrix[0][1] * matrix[2][2] + matrix[0][2] * matrix[2][1])) % 26;
            inverse[1][1] = (invDet * (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0])) % 26;
            inverse[1][2] = (invDet * (-matrix[0][0] * matrix[2][1] + matrix[0][1] * matrix[2][0])) % 26;

            inverse[2][0] = (invDet * (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1])) % 26;
            inverse[2][1] = (invDet * (-matrix[0][0] * matrix[1][2] + matrix[0][2] * matrix[1][0])) % 26;
            inverse[2][2] = (invDet * (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0])) % 26;

            // Đảm bảo tất cả phần tử trong ma trận nghịch đảo đều dương
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    inverse[i][j] = (inverse[i][j] + 26) % 26; // Đảm bảo số dương
                }
            }
        }
        return inverse; // Trả về ma trận nghịch đảo
    }

// Hàm tìm nghịch đảo của một số modulo
    public static int modInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1) {
                return x;
            }
        }
        throw new ArithmeticException("Nghịch đảo không tồn tại.");
    }

    public static int[][] convertStoM(String s) {
        int[][] a = new int[1][s.length()]; // Ma trận 1 hàng
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Chuyển đổi ký tự thành số (A=0, B=1,..., Z=25, a=0, b=1,..., z=25)
            if (Character.isLetter(c)) {
                a[0][i] = Character.toUpperCase(c) - 'A'; // Chuyển đổi sang chữ hoa
            } else {
                System.out.println("Lỗi: Ký tự '" + c + "' không phải là chữ cái.");
                a[0][i] = -1; // Gán giá trị không hợp lệ nếu không phải chữ cái
            }
        }
        return a;
    }

    public static String decryptPair(char a, char b, char[][] matrix) {
        int[] pos1 = findPosition(a, matrix);
        int[] pos2 = findPosition(b, matrix);

        if (pos1[0] == pos2[0]) {
            // Cùng hàng
            return "" + matrix[pos1[0]][(pos1[1] + 4) % 5] + matrix[pos2[0]][(pos2[1] + 4) % 5]; // Lùi một ký tự bên trái
        } else if (pos1[1] == pos2[1]) {
            // Cùng cột
            return "" + matrix[(pos1[0] + 4) % 5][pos1[1]] + matrix[(pos2[0] + 4) % 5][pos2[1]]; // Lùi một ký tự bên trên
        } else {
            // Hình chữ nhật
            return "" + matrix[pos1[0]][pos2[1]] + matrix[pos2[0]][pos1[1]];
        }
    }

    public static String convertMtoS(int[][] a) {
        StringBuilder temp = new StringBuilder(); // Sử dụng StringBuilder để tối ưu
        for (int i = 0; i < a[0].length; i++) {
            if (a[0][i] >= 0 && a[0][i] < 26) { // Kiểm tra giá trị hợp lệ
                temp.append((char) (a[0][i] + 'A')); // Chuyển số thành ký tự
            } else {
                temp.append('?'); // Thay thế ký tự không hợp lệ bằng dấu hỏi
            }
        }
        return temp.toString(); // Chuyển đổi StringBuilder về String
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a;
            a = b;
            b = r % b;
        }
        return a;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int m = A.length;    // Số hàng của ma trận A
        int n = A[0].length; // Số cột của ma trận A và số hàng của ma trận B
        int p = B[0].length; // Số cột của ma trận B

        // Kiểm tra điều kiện nhân ma trận
        if (n != B.length) {
            System.out.println("Không thể nhân hai ma trận: Số cột của ma trận A phải bằng số hàng của ma trận B.");
            return null;
        }

        // Tạo ma trận kết quả với kích thước m x p
        int[][] result = new int[m][p];

        // Nhân ma trận A và B
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    public static String encryptPair(char a, char b, char[][] matrix) {
        int[] posA = findPosition(a, matrix);
        int[] posB = findPosition(b, matrix);

        if (posA[0] == posB[0]) {
            // Cùng hàng
            return "" + matrix[posA[0]][(posA[1] + 1) % 5] + matrix[posB[0]][(posB[1] + 1) % 5];
        } else if (posA[1] == posB[1]) {
            // Cùng cột
            return "" + matrix[(posA[0] + 1) % 5][posA[1]] + matrix[(posB[0] + 1) % 5][posB[1]];
        } else {
            // Hình chữ nhật
            return "" + matrix[posA[0]][posB[1]] + matrix[posB[0]][posA[1]];
        }
    }

    public static int findIndex(int[] key, int value) {
        for (int i = 0; i < key.length; i++) {
            if (key[i] == value) {
                return i;
            }
        }
        return -1;  // Giá trị không hợp lệ
    }
    private void btn_ma_hoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ma_hoaActionPerformed
        String t = cbo_list_item.getSelectedItem().toString();
        String oput = "";
        String iput = txt_input.getText().toUpperCase();
        String k = txt_key.getText().toUpperCase();
        switch (t) {
            case "Mã hóa Ceasar":

                int key = Integer.parseInt(txt_key.getText()) % 26;

                for (char x : iput.toCharArray()) {
                    if (Character.isLetter(x)) {
                        char c = Character.toUpperCase(x);
                        // Sửa lỗi ép kiểu ký tự
                        c = (char) (((int) c - 65 + key) % 26 + 65); // Mã hóa ký tự
                        oput += c; // Thêm ký tự mã hóa vào chuỗi kết quả
                    } else {
                        oput += x; // Giữ nguyên ký tự không phải là chữ cái
                    }
                }
                break; // Kết thúc case
            case "Mã hóa Đơn bảng":

                for (char x : iput.toCharArray()) {
                    if (Character.isLetter(x)) {
                        // Tính chỉ số của ký tự trong bảng chữ cái (0-25)
                        int index = Character.toUpperCase(x) - 'A';
                        oput += k.charAt(index); // Ánh xạ đến ký tự trong key
                    } else {
                        oput += x; // Giữ nguyên ký tự không phải là chữ cái
                    }
                }
                break;
            case "Mã hóa Vigenere":

                // Tách từ khóa thành các số nguyên và lưu vào mảng k1
                int j = 0;
                String[] numk = k.split("\\s+"); // Từ khóa k: "2 8 15 7 4 17"
                int[] k1 = new int[numk.length];

                for (int i = 0; i < numk.length; i++) {
                    k1[i] = Integer.parseInt(numk[i]);
                }

                // Mã hóa Vigenere cho bản rõ iput
                for (int i = 0; i < iput.length(); i++) {
                    char c = iput.charAt(i);

                    // Chỉ xử lý chữ cái (chỉ sử dụng cho chữ hoa)
                    if (Character.isLetter(c)) {
                        // Chuyển tất cả ký tự thành chữ hoa
                        c = Character.toUpperCase(c);

                        // Thực hiện phép mã hóa Vigenere
                        int index = (c - 'A' + k1[j % k1.length]) % 26 + 'A';
                        oput += (char) index;

                        j += 1; // Chỉ tăng j nếu ký tự là chữ cái
                    } else {
                        oput += c; // Giữ nguyên ký tự không phải chữ cái
                    }
                }

                break;

            case "Mã hóa PlayFair":
                char[][] a = new char[5][5];
                boolean[] used = new boolean[26];
                int cnt = 0;
                for (char x : k.toCharArray()) {
                    if (!used[x - 'A']) {
                        a[cnt / 5][cnt % 5] = x;
                        used[x - 'A'] = true;
                        cnt += 1;
                    }
                }
                for (char i = 'A'; i <= 'Z'; i++) {
                    if (!used[i - 'A'] && i != 'J') {
                        a[cnt / 5][cnt % 5] = i;
                        cnt += 1;

                    }

                }
                String temp = iput.replaceAll("\\s+", "");
                if (temp.length() % 2 != 0) {
                    temp += "X";
                }
                temp = temp.replace('J', 'I');
                for (int i = 0; i < temp.length(); i += 2) {
                    oput += encryptPair(temp.charAt(i), temp.charAt(i + 1), a);
                }

                break;
            case "Mã hóa Hill":
                String s = txt_matrix_key.getText();
                String[] rows = s.split("\n"); // Tách từng hàng

                // Tạo ma trận số nguyên với kích thước tương ứng
                int[][] matrix = new int[rows.length][];

                // Lặp qua từng hàng
                for (int i = 0; i < rows.length; i++) {
                    // Tách các phần tử trong hàng
                    String[] elements = rows[i].trim().split("\\s+"); // Tách bằng khoảng trắng

                    // Khởi tạo mảng con cho hàng
                    matrix[i] = new int[elements.length];

                    // Chuyển từng phần tử thành số nguyên và gán vào ma trận
                    for (int z = 0; z < elements.length; z++) {
                        try {
                            matrix[i][z] = Integer.parseInt(elements[z]);
                        } catch (NumberFormatException e) {
                            System.out.println("Lỗi: Không thể chuyển đổi '" + elements[z] + "' thành số.");
                            // Có thể gán giá trị mặc định hoặc xử lý khác tại đây
                        }
                    }
                }

                // Chuẩn bị văn bản đầu vào để mã hóa
                String temp2 = iput.replaceAll("\\s+", "").toUpperCase(); // Chuyển đổi thành chữ hoa và xóa khoảng trắng
                while (temp2.length() % matrix.length != 0) {
                    temp2 += "X"; // Thêm 'X' để có độ dài phù hợp
                }

                for (int i = 0; i < temp2.length(); i += matrix.length) {
                    String g = temp2.substring(i, i + matrix.length);
                    int[][] matA = convertStoM(g);
                    oput += (convertMtoS(mod(multiplyMatrices(matA, matrix))));
                }

                // Xuất kết quả
                break;

            case "Mã hóa Affine":
                String[] num = k.split("\\s+");
                int[] b = new int[num.length];
                for (int i = 0; i < b.length; i++) {
                    b[i] = Integer.parseInt(num[i]);
                }
                if (gcd(b[0], 26) == 1) {
                    for (char x : iput.toCharArray()) {
                        if (Character.isLetter(x)) {
                            oput += (char) (((x - 'A') * b[0] + b[1]) % 26 + 65);
                        } else {
                            oput += x;
                        }
                    }
                }
                break;
            case "Mã hóa Hàng":
                // Tách các số trong khóa bằng khoảng trắng
                String[] keyParts = k.split("\\s+");
                int[] keya = new int[keyParts.length];

                // Chuyển đổi các phần tử trong khóa sang kiểu số nguyên
                for (int i = 0; i < keyParts.length; i++) {
                    keya[i] = Integer.parseInt(keyParts[i]); // Chuyển đổi các phần tử thành số nguyên
                }

                // Tạo mảng để lưu trữ kết quả mã hóa cho từng cột
                String[] arr = new String[keya.length];
                for (int i = 0; i < keya.length; i++) {
                    arr[i] = ""; // Khởi tạo mỗi phần tử của arr
                }

                // Mã hóa văn bản đầu vào theo thứ tự hàng
                for (int i = 0; i < iput.length(); i++) {
                    // Sử dụng khóa đã tách để xác định cột
                    int columnIndex = keya[i % keya.length] - 1; // Chỉ số cột (trừ 1 để phù hợp với chỉ số mảng)
                    arr[columnIndex] += iput.charAt(i); // Thêm ký tự vào cột tương ứng
                }

                // Tạo văn bản mã hóa từ các cột
                for (int i = 0; i < keya.length; i++) {
                    oput += arr[i]; // Kết hợp các cột lại với nhau
                }
                break;

        }

        // Hiển thị kết quả
        txt_output.setText(oput);
    }//GEN-LAST:event_btn_ma_hoaActionPerformed

    private void txt_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inputActionPerformed

    private void txt_outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_outputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_outputActionPerformed

    private void txt_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_keyActionPerformed
        txt_key.setText("");
    }//GEN-LAST:event_txt_keyActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_input.setText("");
        txt_output.setText("");
        txt_key.setText("");
        txt_matrix_key.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_giai_maActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giai_maActionPerformed
        String t = cbo_list_item.getSelectedItem().toString();
        String oput = "";
        String iput = txt_input.getText().toUpperCase();
        String k = txt_key.getText().toUpperCase();
        switch (t) {
            case "Mã hóa Ceasar":

                int key = Integer.parseInt(txt_key.getText()) % 26;

                for (char x : iput.toCharArray()) {
                    if (Character.isLetter(x)) {
                        char c = Character.toUpperCase(x);
                        // Sửa lỗi ép kiểu ký tự
                        c = (char) (((int) c - 65 - key + 26) % 26 + 65); // Mã hóa ký tự
                        oput += c; // Thêm ký tự mã hóa vào chuỗi kết quả
                    } else {
                        oput += x; // Giữ nguyên ký tự không phải là chữ cái
                    }
                }
                break; // Kết thúc case
            case "Mã hóa Đơn bảng":
                HashMap<Character, Character> h = new HashMap<>();
                for (int i = 0; i < k.length(); i++) {
                    h.put(k.charAt(i), (char) (i + 'A'));
                }
                for (char x : iput.toCharArray()) {
                    if (Character.isLetter(x)) {
                        // Tính chỉ số của ký tự trong bảng chữ cái (0-25)

                        oput += h.get(x); // Ánh xạ đến ký tự trong key
                    } else {
                        oput += x; // Giữ nguyên ký tự không phải là chữ cái
                    }
                }
                break;
            case "Mã hóa Vigenere":

                // Tách từ khóa thành các số nguyên và lưu vào mảng k1
                int j = 0;
                String[] numk = k.split("\\s+"); // Từ khóa k: "2 8 15 7 4 17"
                int[] k1 = new int[numk.length];

                for (int i = 0; i < numk.length; i++) {
                    k1[i] = Integer.parseInt(numk[i]);
                }

                // Giải mã Vigenere cho bản mã iput
                for (int i = 0; i < iput.length(); i++) {
                    char c = iput.charAt(i);

                    // Chỉ xử lý chữ cái (chỉ sử dụng cho chữ hoa)
                    if (Character.isLetter(c)) {
                        // Chuyển tất cả ký tự thành chữ hoa
                        c = Character.toUpperCase(c);

                        // Thực hiện phép giải mã Vigenere
                        int index = (c - 'A' - k1[j % k1.length] + 26) % 26 + 'A';
                        oput += (char) index;

                        j += 1; // Chỉ tăng j nếu ký tự là chữ cái
                    } else {
                        oput += c; // Giữ nguyên ký tự không phải chữ cái
                    }
                }

                break;
            case "Mã hóa PlayFair":
                char[][] a = new char[5][5];
                boolean[] used = new boolean[26];
                int cnt = 0;

                // Xây dựng bảng Playfair từ từ khóa
                for (char x : k.toCharArray()) {
                    if (!used[x - 'A']) {
                        a[cnt / 5][cnt % 5] = x;
                        used[x - 'A'] = true;
                        cnt += 1;
                    }
                }
                for (char i = 'A'; i <= 'Z'; i++) {
                    if (!used[i - 'A'] && i != 'J') {
                        a[cnt / 5][cnt % 5] = i;
                        cnt += 1;
                    }
                }

                String temp = iput.replaceAll("\\s+", "");
                StringBuilder oputBuilder = new StringBuilder();

                // Giải mã cặp ký tự
                for (int i = 0; i < temp.length(); i += 2) {
                    char firstChar = temp.charAt(i);
                    char secondChar = temp.charAt(i + 1);
                    oputBuilder.append(decryptPair(firstChar, secondChar, a));
                }

                oput = oputBuilder.toString();
                break;
            case "Mã hóa Hill":
                // Nhập ma trận khóa từ người dùng
                String sDecrypt = txt_matrix_key.getText();
                String[] rowsDecrypt = sDecrypt.split("\n"); // Tách từng hàng

                // Tạo ma trận số nguyên với kích thước tương ứng
                int[][] decryptMatrix = new int[rowsDecrypt.length][];

                // Lặp qua từng hàng
                for (int i = 0; i < rowsDecrypt.length; i++) {
                    // Tách các phần tử trong hàng
                    String[] elements = rowsDecrypt[i].trim().split("\\s+"); // Tách bằng khoảng trắng

                    // Khởi tạo mảng con cho hàng
                    decryptMatrix[i] = new int[elements.length];

                    // Chuyển từng phần tử thành số nguyên và gán vào ma trận
                    for (int z = 0; z < elements.length; z++) {
                        try {
                            decryptMatrix[i][z] = Integer.parseInt(elements[z]);
                        } catch (NumberFormatException e) {
                            System.out.println("Lỗi: Không thể chuyển đổi '" + elements[z] + "' thành số.");
                        }
                    }
                }

                // Tính ma trận nghịch đảo cho ma trận khóa
                int[][] inverseMatrix = invertMatrix(decryptMatrix);

                // Chuẩn bị văn bản đầu vào để giải mã
                String tempDecrypt = iput.replaceAll("\\s+", "").toUpperCase(); // Chuyển đổi thành chữ hoa và xóa khoảng trắng

                // Kiểm tra độ dài và thêm 'X' nếu cần
                while (tempDecrypt.length() % inverseMatrix.length != 0) {
                    tempDecrypt += "X"; // Thêm 'X' để có độ dài phù hợp
                }

                // Giải mã từng khối
                for (int i = 0; i < tempDecrypt.length(); i += inverseMatrix.length) {
                    String g = tempDecrypt.substring(i, i + inverseMatrix.length);
                    int[][] matA = convertStoM(g); // Chuyển đổi ký tự thành ma trận

                    // Nhân với ma trận nghịch đảo và chuyển đổi lại thành ký tự
                    oput += convertMtoS(mod(multiplyMatrices(matA, inverseMatrix)));
                }

                break;
            case "Mã hóa Affine":
                String[] numDecrypt = k.split("\\s+");
                int[] bDecrypt = new int[numDecrypt.length];
                for (int i = 0; i < bDecrypt.length; i++) {
                    bDecrypt[i] = Integer.parseInt(numDecrypt[i]);
                }

                // Tính nghịch đảo của b[0]
                int aInverse = modInverse(bDecrypt[0], 26);

                // Giải mã từng ký tự
                for (char x : iput.toCharArray()) {
                    if (Character.isLetter(x)) {
                        // Tính chỉ số của ký tự
                        int y = (x - 'A');
                        // Áp dụng công thức giải mã
                        oput += (char) ((aInverse * (y - bDecrypt[1] + 26)) % 26 + 'A');
                    } else {
                        oput += x; // Giữ nguyên ký tự không phải chữ
                    }
                }
                break;
            case "Mã hóa Hàng":
                String[] nu = k.split("\\s+");
                int num_col = nu.length;
                int num_row = (int) Math.ceil((double) iput.length() / num_col);
                int[] ax = new int[num_col];
                //ánh xạ cột i sang cột thứ s[i]
                int[] ax2 = new int[num_col];
                // ánh xạ người tử s[i] sang i
                for (int i = 0; i < num_col; i++) {
                    ax[i] = (Integer.parseInt(nu[i]) - 1);
                    ax2[ax[i]] = i;
                }
                int cnt_k[] = new int[num_col];
                String[] g_s = new String[num_col];
                for (int i = 0; i < num_col; i++) {
                    cnt_k[i] = 0;
                    g_s[i] = "";
                }

                for (int i = 0; i < iput.length(); i++) {
                    cnt_k[ax[i % num_col]] += 1;

                }
//                for(int i = 0; i < num_col; i++){
//                    oput += ax[i] + "-" + cnt_k[ax[i]] + "///";
//                }
                int st = 0;
                for (int i = 0; i < num_col; i++) {
                    g_s[i] += iput.substring(st, st + cnt_k[i]);
                    st += cnt_k[i];
                }
                char[][] ck = new char[num_row][num_col];
                for (int i = 0; i < num_row; i++) {
                    for (int d = 0; d < num_col; d++) {
                        ck[i][d] = '!';
                    }
                }
                for (int i = 0; i < num_row; i++) {
                    for (int d = 0; d < num_col; d++) {
                        if (i < g_s[ax[d]].length()) {
                            ck[i][d] = g_s[ax[d]].charAt(i);
                        }
                    }
                }
                for (int i = 0; i < num_row; i++) {
                    for (int d = 0; d < num_col; d++) {
                        if (ck[i][d] != '!') {
                            oput += ck[i][d];
                        }
                    }
                }
                break;

        }
        txt_output.setText(oput);
    }//GEN-LAST:event_btn_giai_maActionPerformed

    private void cbo_list_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_list_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_list_itemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_giai_ma;
    private javax.swing.JButton btn_ma_hoa;
    private javax.swing.JComboBox<String> cbo_list_item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JTextField txt_input;
    private javax.swing.JTextField txt_key;
    private java.awt.TextArea txt_matrix_key;
    private javax.swing.JTextField txt_output;
    // End of variables declaration//GEN-END:variables
}
