	import java.awt.Color;
	import java.awt.Graphics;
	 
public class DrawableSmileyFace extends DrawableCircle {



		
		//Private variables holding default starting values
		private int x;
		private int y;
		int diam;
		private Color smileyColor;
		 
		/**
		 * Construct a new drawable smiley face
		 * 
		 * @param newX starting x value
		 * @param newY starting y value
		 * @param newDiam starting diameter
		 * @param newColor base color of the face
		 **/
		public DrawableSmileyFace(int newX, int newY, int newDiam, Color newSColor) {
			super(newX, newY, newDiam, newSColor);

			smileyColor = newSColor;
			 
		
		}
			/**
			 * Draws the bubble on the screen
			 * 
			 * @param g graphics object to draw on
			 **/
			public void draw(Graphics g) {
				//draw the base circle
				super.draw(g);
				
				//Set the color of the highlight
				g.setColor(smileyColor);
				
				//Draw the highlight
				
			int arc_Y1 =  getY() + (getDiam()/2);
			int arc_X1 =  getX() + (getDiam()/2)-5;
			//draw the smiley arc
			g.setColor(Color.black);
			g.drawArc(arc_X1,arc_Y1,10,10,0,-180 );
			//draw the weird eyes
			g.drawLine(getX()+(getDiam()/3),getY()+(getDiam()/3), getX()+(getDiam()/3)+20,getY()+(getDiam()/3));
			
			
		}
		 
	 }

