 class AnimalRunner{
 
 public static void main(String[] values){

  String dog="Dog";
  String cat="Cat";
  String goldfish="Goldfish";
  String mouse="Mouse";
  String rabbit="Rabbit";
  String tiger="Tiger";
  String lion="Lion";
  String camel="Camel";
  String kangaroo;
  
  
  String[] animals={dog,cat,goldfish,mouse,rabbit,tiger,lion,"Beer"};
  
  int size=animals.length;
  
  System.out.println("Total animals"+size);
  
  kangaroo=null;
  System.out.println("kangaroo"+kangaroo);

  System.out.println("Index 0 : "+animals[0]);
  System.out.println("Index 1 : "+animals[1]);
  System.out.println("Index 2 : "+animals[2]);
  System.out.println("Index 3 : "+animals[3]);
  System.out.println("Index 4 : "+animals[4]);
  System.out.println("Index 5 : "+animals[5]);
  System.out.println("Index 6 : "+animals[6]);
  System.out.println("Index 7 : "+animals[7]);
}
}