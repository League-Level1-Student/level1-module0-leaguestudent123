 int speed= 5;
 int x =255;
 int y=255;
 int hieght=5;
PImage backgroundImage;


 
 
 void setup(){
   
   size(500  , 400);
backgroundImage = loadImage("hand.jpg");

   
   
 }
 void draw(){
  image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);
 
 
   
   fill(255, 255, 255);
stroke(255,255 ,255 );
ellipse(x, y, 5,5 );
 x=x+speed;
   
   if(x>500){
     speed=-speed;
   }
   if(x<0){
    speed=-speed; 
   }
   
   y=y+hieght;
   
   if(y>400){
     hieght=-hieght;
   }
   if(y<0){
    hieght=-hieght; 
   }
   rect(10,mouseY , 10, 50);
  
   boolean something=intersects(x, y, 10, mouseY, 10);
   if(something==true){
     speed=-speed;
   }
   
   
 }
  boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}



 
