public class pluralize {
    public static void main(String[] args) {
        pluralize ("cow", 1);
    }

    public static void pluralize (String str, int num) {
        String s = "";
        if (num != 1){
            s = "s";
        }

        System.out.println("I have " + num + " " + str + s);
    }
}

