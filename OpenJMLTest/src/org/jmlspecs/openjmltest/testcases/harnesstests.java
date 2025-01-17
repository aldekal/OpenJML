package org.jmlspecs.openjmltest.testcases;

import org.jmlspecs.openjmltest.TCBase;
import org.junit.Test;

/** Does some rough tests of the TCBase test harness */
@org.junit.FixMethodOrder(org.junit.runners.MethodSorters.NAME_ASCENDING)
public class harnesstests extends TCBase {

    @Override
    public void setUp() throws Exception {
//        noCollectDiagnostics = true;
//        jmldebug = true;
        super.setUp();
    }

    // These test that the harness fails gracefully
    /** Test that harness reports a missing error */
    @Test
    public void testHarness() {
        helpFailure("Fewer errors observed (0) than expected (1)",
                " class A {}","X",1);
    }

    /** Test that harness reports an unexpected error */
    @Test
    public void testHarness1() {
        helpFailure("More errors observed (1) than expected (0)",
        " class A { QQ }");
    }

    /** Test that harness reports a missing argument */
    @Test
    public void testHarness2() {
        helpFailure("No positions given for message 0",
                " class A { QQ }","/TEST.java:1: error: <identifier> expected");
    }

    /** Test that harness reports a wrong column */
    @Test
    public void testHarness3() {
        helpFailure("Column for message 0 expected:<-1> but was:<14>",
                " class A { QQ }","/TEST.java:1: error: <identifier> expected",-1,"",0,"",0);
    }

    /** Test that harness reports a mismatched message */
    @Test
    public void testHarness4() {
        helpFailure("Message 0 mismatch expected:<[X]> but was:<[/TEST.java:1: error: <identifier> expected]>",
                " class A { QQ }","X",0,"",0,"",0);
    }

}
