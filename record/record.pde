PImage pictureOfRecord;   

int angle=0;

void setup() {

  size(600, 600);  
  pictureOfRecord= loadImage("a record.jpeg");
  pictureOfRecord.resize(height, width);
}
void draw() {
  
  rotateImage(pictureOfRecord, angle);
  
  image( pictureOfRecord, 0, 0, width, height);
  if(mousePressed){
    angle=angle+1;
  }
}

void rotateImage (PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
  
}
 
  
  
  
