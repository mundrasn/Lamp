            // This program is copyright VUW.
        // You are granted permission to use it to construct your answer to a Onslow College 13DTC assignment.
        // You may not distribute it in any other way without permission.
        
        /* Exercise for Onslow College 13DTC
         * Name:
         * Email:
         * Date:
         */
        
        import ecs100.*;
        import java.awt.Color;
        
    /** A Lamp object represents a table lamp on the graphics pane. A lamp consists of a colored bulb and a stem.
     *   It remembers its current position, its color and whether it is on or off.
     *   Its initial position and its color are set when it is constructed.
     *   The diameter of a bulb should be 80.
     *   The height of the stem should be 80.
     *   The width of the stem should be 20.
     *   It has three methods:
     *     draw(),        which draws the lamp at its current position.
     *     onBulb(x,y),   which reports whether the point(x,y) is on the bulb.
     *     onStem(x,y),   which reports whether the point(x,y) is on the stem.
     *     turnOff(),     which turns the light off.
     *     changeColor(), which turns the light on if it is off; changes its color to a random bright colour if it is already on. 
     */
        
    public class Lamp{
    
        public static final double SIZE = 80;  // diameter of the bulb and height of the stem
        public static final double STEMWIDTH = SIZE/8 ;// width of the stem is SIZE/4
        public static final double STEMHEIGHT = SIZE * 2;// width of the stem is SIZE/4
        
        public static final double XPOS = 185;//
        public static final double YPOS = 190; 
        
        public static final double BULBXY = 150;
        
        private boolean bulbOn = false;
        
        //fields
        /*# YOUR CODE HERE */
    
        /** Constructor: passed the initial position.
         * Initialises the fields
         */
        public Lamp(double x, double y){
            UI.initialise();
            UI.addButton("Quit", UI::quit);
            //myLamp = new Lamp(100, 150);
        }
    
        /**
         * draws the lamp at its current position:
         * - the bulb of the right colour.
         * - the stem darkGray
         * The height of the stem is the same as the diameter of the bulb
         * The width of the stem is a quater of its height
         */
        public void draw(){
            // 
            UI.fillOval(BULBXY, BULBXY, SIZE, SIZE);
                
            UI.fillRect(XPOS, YPOS, STEMWIDTH, STEMHEIGHT);
        } 
        
        /**
         * Return the x location
         */
        //public double getX(){
            
        //}
        
        /**
         * Return the y location
         */
       // public double getY(){
            
        //}
    
        /** 
         * Reports whether the point (x,y) is on the bulb.
         * (x and y represent the position where the mouse was released):
         */
        //public boolean onBulb(double x, double y){
            // an easy approximation is to pretend it is the enclosing rectangle.
            // It is nicer to do a little bit of geometry and get it right
            /*# YOUR CODE HERE */
         //   if (action.equals("clicked")){
                // if x value of bulb is = x && y = y 
                    //bulbOn = true;
                   //else {
                       //bulbOn = false;
                    //}
         //   }
        //}   
    
        /**
         * Reports whether the point (x,y) is on the stem.
         * (x and y represent the position where the mouse was released):
         */
        //public boolean onStem(double x, double y){
            /*# YOUR CODE HERE */
     
        //}   
        
        /**
         * Turns the light off.
         * Does not redraw
         */
        //    public void turnOff(){
                /*# YOUR CODE HERE */
         //       if (bulbOn = true){
                    //color 
            //    } else {
                    // color = black
             //   }
        //}   
    
        /** changeColor method (no parameters):
         * Turns the light on (if it is off)
         * Changes its color to a random bright colour (if it is already on).
         * Does not redraw
         */
        //public void changeColor(){
            /*# YOUR CODE HERE */
    
        //}   
}
