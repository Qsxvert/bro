package bro.app;

import org.deeplearning4j.models.sequencevectors.graph.primitives.Vertex;
import org.deeplearning4j.nn.conf.ComputationGraphConfiguration;
import org.deeplearning4j.nn.conf.NeuralNetConfiguration.Builder;

public class App {
	
	public void broConfig() {
//	MultiLayerConfiguration conf = new 	NeuralNetConfiguration.Builder()
//	        .weightInit(WeightInit.XAVIER)
//	        .activation(Activation.RELU)
//	        .optimizationAlgo(OptimizationAlgorithm.STOCHASTIC_GRADIENT_DESCENT)
//	        .updater(new Sgd(0.05))
//	        .list()
////	        .backprop(true)
//	        .build();
//	
//	System.out.println(2);
		
		Builder builder = new Builder();
		
		ComputationGraphConfiguration graph = new ComputationGraphConfiguration.GraphBuilder(builder)
			.addInputs("inputLayer")
			.setOutputs("outputLayer")
			.build();
	}
	
}
