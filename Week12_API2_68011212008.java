import java.util.*;

class Week12_API2_68011212008 {
    Scanner scan = new Scanner(System.in);

    String readIDcode() {
        String code = "";
        System.out.print("ID Card : ");
        code = scan.nextLine();
        return code;
    }

    String cutting(String code) {
        // แก้ไขตรงนี้: [^0-9] หมายถึงตัดทุกอย่างที่ไม่ใช่ตัวเลข 0-9 ทิ้งไป
        String idcode = code.replaceAll("[^0-9]", "");
        return idcode;
    }

    void process() {
        int sum = 0;
        String code = readIDcode();
        String idcode = cutting(code);
        
        // ตรวจสอบเบื้องต้นว่ามีตัวเลขครบ 13 หลักหรือไม่ เพื่อป้องกัน Error
        if (idcode.length() < 13) {
            System.out.println("Error: ID Code must contain at least 13 digits.");
            return;
        }

        String[] arry = idcode.split("");
        int IDcode[] = new int[idcode.length()];
        
        System.out.print("Digits: ");
        for (int i = 0; i < idcode.length(); i++) {
            IDcode[i] = Integer.valueOf(arry[i]);
            System.out.printf("%d ", IDcode[i]);
        }
        System.out.println();

        int j = 13; // สูตรบัตรประชาชนไทยเริ่มคูณจาก 13 ลงไปถึง 2
        int result[] = new int[12]; // ใช้แค่ 12 หลักแรกในการคำนวณ
        
        for (int i = 0; i < 12; i++) {
            result[i] = IDcode[i] * j;
            sum = sum + result[i];
            System.out.printf("%d ", result[i]);
            j--;
        }
        System.out.println();

        for (int i = 0; i < 12; i++) {
            System.out.printf("%d", result[i]);
            if (i < 11) System.out.print("+");
        }
        System.out.printf(" = %d\n", sum);

        int mod = sum % 11;
        System.out.printf("%d %% 11 = %d\n", sum, mod);

        int moded = (11 - mod) % 10;
        System.out.printf("(11 - %d) %% 10 = %d\n", mod, moded);

        if (moded == IDcode[12]) {
            System.out.printf("Result for %s : True\n", idcode);
        } else {
            System.out.printf("Result for %s : False (Expected %d, but got %d)\n", idcode, moded, IDcode[12]);
        }
    }

    public static void main(String[] args) {
        Week12_API2_68011212008 obj = new Week12_API2_68011212008();
        obj.process();
    }
}
