/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testKeepZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepBlue();
    beach.explore();
  }

  public static void testNegate() {
    Picture beach = new Picture ("beach.jpg");
    beach.negate();
    beach.explore();
  }

  public static void testMirrorVerticalRightToLeft() {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }

  public static void testMirrorHorizontal() {
    Picture caterpillar = new Picture("redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }

  public static void testMirrorHorizontalBottomToTop() {
    Picture caterpillar = new Picture("redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBottomToTop();
    caterpillar.explore();
  }

  public static void testMirrorDiagonal(){
    Picture beach = new Picture("beach.jpg");
    beach.mirrorDiagonal();
    beach.explore();
  }
  
  public static void testCopy(){
    Picture hehe = new Picture("cat.jpg");
    Picture blank = new Picture("7inX95in.jpg");
    blank.copyPicture(hehe, 100, 500, 0, 300);
    blank.explore();
  }
  
  public static void testnewCollage() {
    Picture blank = new Picture("7inX95in.jpg");
    blank.myCollage();
    blank.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    // testKeepZeroBlue();
    //testNegate();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    // testMirrorVerticalRightToLeft();
    // testMirrorHorizontal();
    // testMirrorHorizontalBottomToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    // testMirrorDiagonal();
    // testCopy();
    testnewCollage();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}