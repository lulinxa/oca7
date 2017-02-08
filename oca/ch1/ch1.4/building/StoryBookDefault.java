package building;
import library.BookDefault;
class StoryBookDefault extends BookDefault {
  StoryBookDefault() {
    int c = issueCount;
    issueHistory();
  }
}

/*

EXAM TIP Default access can be compared to package-private (accessible
only within a package) and protected access can be compared to packageprivate
+ kids (“kids” refer to derived classes). Kids can access protected
methods only by inheritance and not by reference (accessing members by
using the dot operator on an object).

*/
