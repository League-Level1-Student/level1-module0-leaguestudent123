 int score;
 int randomNumber = (int) random(width);
 int rain=0;
 void setup(){
   
   size(500, 500);
 
      
   
   
   
 }
 void draw(){
    
   
   
   background(#0573E5);
   fill(#25FF05);
   rect( mouseX,  450, 100,  100);
   fill(#3CFF03);
stroke(#25FF05);
ellipse(randomNumber, rain, 10, 10);

   rain=rain+1;
   if(rain>height){
     checkCatch(randomNumber);
     randomNumber = (int) random(width); rain=0;
    
 }
   
   
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
   
   
   
   
   
 }
 void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }

 
 
 
 
 
