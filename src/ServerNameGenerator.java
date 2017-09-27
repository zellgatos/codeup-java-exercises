import util.Input;

public class ServerNameGenerator {
    String[] nouns = new String[]{
            "Laila", "Repede", "cookies", "Pan", "Peach", "Mario", "Laphicet", "Senel", "Chips", "Jacket"
    };

    String[] adjs = new String[]{
            "Happy", "Salty", "Willfull", "Brave", "Calm", "Gentle", "Old", "Big", "Small", "Able"
    };


    public static void main(String[] args) {
        Input input = new Input();
        do{
            ServerNameGenerator server = new ServerNameGenerator();
            String randomName = server.getRandomArray(server.adjs)+"-"+server.getRandomArray(server.nouns);
            System.out.println("here is your server name: " + randomName);}while(input.yesOrNo());

    }
    public int randomNum(int max, int min){
        return (int)Math.floor((Math.random()* max)+ min);
    }

    public int randomNum(int max){
        return randomNum(max, 0);
    }

    public String getRandomArray(String[] array){
        return array[randomNum(array.length)];
    }

}