
   public class DrawFigure3 {
      public static void main(String[] args) {
	  DrawDiamond();
	  DrawX();
	  DrawRocket();
	  } 
	  public static void DrawDiamond(){
	  drawcone();
	  drawV();
	  System.out.println();
	  }
	  
	  public static void DrawX(){
	  drawV();
	  drawcone();
	  System.out.println();
	  }
	  
	  public static void DrawRocket(){
	  drawcone();
	  drawBox();
	  System.out.println("|United|");
	  System.out.println("|States|");
	  drawBox();
	  drawcone();
	  System.out.println();
	  }
	
	  public static void drawcone (){
	   System.out.println("   /\\");
      System.out.println("  /  \\");
      System.out.println(" /    \\");
	  
	  } 
	  
	  public static void drawV (){
	   System.out.println(" \\    /");
      System.out.println("  \\  /");
      System.out.println("   \\/");
      
	  }
	  
	  public static void drawBox (){
	   System.out.println("+------+");
      System.out.println("|      |");
      System.out.println("|      |");
      System.out.println("+------+");
	  
	
	
	    }
	}

    
