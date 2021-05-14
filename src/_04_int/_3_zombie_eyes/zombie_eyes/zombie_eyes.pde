
void setup() {
PImage face = loadImage("face.png");
face.resize(500, 500);
image(face, 0, 0);
size(500,500);
}

void draw() {
ellipse(140,260, 30,30);
ellipse(325,260, 30,30);
fill(#080300);

ellipse(325,260, 10,10);
ellipse(140,260, 10,10);
fill(mouseX,mouseY,mouseX);

}
