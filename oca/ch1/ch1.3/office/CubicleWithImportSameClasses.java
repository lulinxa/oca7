package office;
/*
 * Ttying to import LivingRoom class
 * from home package and from university package
 * without explicitly writing in import statemnt
 * but using * as reference to all classes in 
 * their respective packages
 */
import home.*;
import university.*;
public class CubicleWithImportSameClasses {
  /*
   * This isn't working 'cause ambiguous references
   * home.LivingRoom
   * university.LivingRoom
   *
   * NOT COMPILING!!!
   */
  LivingRoom lr = new LivingRoom();
}
