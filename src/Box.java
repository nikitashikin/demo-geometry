public class Box {

    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Konstruirovanie ob'ecta Box");
        width = 10;
        height=10;
        depth=10;
    }

   double volume() {
       return width * height * depth;
   }



}
