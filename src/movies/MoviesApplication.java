package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){
        Input input = new Input();
        MoviesArray movies = new MoviesArray();
        int userInput;
        do {
            System.out.println("What would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category\n");
            System.out.print("Enter your choice: ");
            userInput=input.getInt(0,5);
            System.out.println("here is your list... ");

            switch (userInput) {
                case 0:
                    System.out.println("You quit the application...");
                    break;
                case 1:
                    for(Movie movie : movies.findAll()){
                        System.out.println(movie.getName()+" : "+movie.getCategory());
                    }
                    break;
                case 2:
                    for(Movie movie : movies.findAll()){
                        if(movie.getCategory().equalsIgnoreCase("animated")) {
                            System.out.println(movie.getName() + " : " + movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for(Movie movie : movies.findAll()){
                        if(movie.getCategory().equalsIgnoreCase("drama")) {
                            System.out.println(movie.getName() + " : " + movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for(Movie movie : movies.findAll()){
                        if(movie.getCategory().equalsIgnoreCase("horror")) {
                            System.out.println(movie.getName() + " : " + movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for(Movie movie : movies.findAll()){
                        if(movie.getCategory().equalsIgnoreCase("scifi")) {
                            System.out.println(movie.getName() + " : " + movie.getCategory());
                        }
                    }
                    break;

            }
        }while(userInput!=0);
    }

}
