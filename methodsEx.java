class computer {
    public void PlayMusic() {
        System.out.println("Music playing...");
    }

    public String getMeAPen(int cost) {
        if (cost > 10)
            return "pen";
        else
            return "no pen";
    }
}

public class methodsEx {
    public static void main(String args[]) {
        computer obj = new computer();
        obj.PlayMusic();
        String str = obj.getMeAPen(15);
        System.out.println(str);

    }
}