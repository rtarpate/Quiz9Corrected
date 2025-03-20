public static void main(String[] args)
{
    Scanner myObj = new Scanner(System.in);

    System.out.println("what is your frist name");

    String fristname = myObj.nextLine();

    System.out.println("what is your last name");

    String lastname = myObj.nextLine();

    System.out.println("what is your age name");

    int age = myObj.nextInt();
    myObj.nextLine();

    System.out.println("what is your favoitre color");

    String favcolor = myObj.nextLine();

    System.out.println("hello " + fristname + " " + lastname + " your age is " + age + " your favoirte color is " + favcolor);

}


