package c5.assertions;

import java.io.File;

/*
 Using Assertions Appropriately
 (1)Don't Use Assertions to Validate Arguments to a Public Method
 (2)Do Use Assertions to Validate Arguments to a Private Method
 (3)Don't Use Assertions to Validate Command-Line Arguments
 (4)Do Use Assertions, Even in Public Methods, to Check for Cases
 that You Know Are Never, Ever Supposed to Happen
 (5)Don't Use Assert Expressions that Can Cause Side Effects!
 */
public class Assertion {

    public void doStuff(int x) {
        assert (x > 0); // inappropriate !  (1)

        //(4)
        int y;
        switch (x) {
            case 1:
                y = 3;
                break;
            case 2:
                y = 9;
                break;
            case 3:
                y = 27;
                break;
            default:
                assert false; // we're never supposed to get here!
        }

        //(5)
        assert (modifyThings());
    }

    public boolean modifyThings() {
        //do things
        return true;
    }

}