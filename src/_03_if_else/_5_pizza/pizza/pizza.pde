 PImage pepperoni;
void setup() {
     pepperoni = loadImage("pepperoni.png");
    
    size(800,800);
    fill(#DBAA6A);
    ellipse(400,400, 400,400);
    
    fill(#FF5100);
    ellipse(400,400, 350,350);
    fill(#F9FF55);
    ellipse(400,400, 325,325);
    
   
}
void draw() {
     if(mousePressed){
    pepperoni.resize(50,50);
    image(pepperoni,300,300);
    image(pepperoni,350,250);
    image(pepperoni,350,350);
    image(pepperoni,400,300);
    image(pepperoni,450,300);
    
    }
}
