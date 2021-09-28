package agents;
import calcsrc.linearRegression;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class OneShotAgent extends Agent {
    private AgentGUI myGUI;
    protected void setup() {
        myGUI=new AgentGUI(this);
        myGUI.showGui();
    }

    public void executeAgent(final double x) {
        addBehaviour(new OneShotBehaviour() {
            public void action() {
                int[][] dataset = new  int[][]{{651,23},{762,26},{856,30},{1063,34},{1190,43},{1298,48},{1421,52},{1440,57},{1518,58}};

                linearRegression slp = new linearRegression(dataset,x);
                slp.printRegressionEquation();
                slp.printYHat();
            }
        } );

    }
}
