package unstableTask;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class RunAnyTimes  implements TestRule {

        @Override
        public Statement apply(Statement base, Description desc) {
            return new RunAnyTimesStatement(base, desc);
        }

        public class RunAnyTimesStatement extends Statement {

            private final Statement base;
            private Description desc;

            public RunAnyTimesStatement(Statement base, Description desc) {
                this.base = base;
                this.desc = desc;
            }

            @Override
            public void evaluate() throws Throwable {
                try {
                    base.evaluate();
                } catch (Throwable t) {
                    System.out.println("Failed on first attempt: " + desc);
                    base.evaluate();
                }
            }
        }
    }

