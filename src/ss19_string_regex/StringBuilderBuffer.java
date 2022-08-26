package ss19_string_regex;

public class StringBuilderBuffer {
    public static void main(String[] args) {
//        String name = "Mậu Hoàng"; // Nguyên thủy
//        String name2 = new String("Minh Châu"); // Tham chiếu

//        int a = 2;
//        String name = "Mậu Hoàng";
//        name = "        Minh Châu           ".trim();

//        String name = "Mậu "; //name là biến đối tượng hỉ
//        name = name + "Hoàng";
//        name = name + "Hoàng";
//        name = name.concat("Hoàng");
//        // Quá tải toán tử
//
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("Mậu ");
//        stringBuilder.append("Hoàng");
//        stringBuilder.append("Hoàng");
//        stringBuilder.append("Hoàng");
//
//
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Mậu Hoàng");

        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder.append("Mậu Hoàng");

        System.out.println(stringBuilder.toString().equals(stringBuilder2.toString()));

        String str = new String("Minh Châu");
        String str2 = new String("Minh Châu");
        System.out.println(str.equals(str2));
    }
}
