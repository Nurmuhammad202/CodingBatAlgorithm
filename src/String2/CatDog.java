package String2;

public class CatDog {
    public boolean catDog(String str) {
        char[] list = str.toCharArray();

        int counterCat = 0;
        int counterDog = 0;

        for (int i = 0; i < list.length; i++) {
            if((i+2)<list.length) {
                if(list[i] == 'c' && list[i+1] == 'a' && list[i+2] == 't') {
                    counterCat++;
                }

                if(list[i] == 'd' && list[i+1] == 'o' && list[i+2] == 'g') {
                    counterDog++;
                }
            }
        }
        return (counterCat == counterDog);
    }
}
