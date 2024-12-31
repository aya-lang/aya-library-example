package example.spi;

import aya.eval.BlockEvaluator;
import aya.instruction.named.NamedInstructionStore;
import aya.instruction.named.NamedOperator;
import aya.obj.list.List;

import java.util.Arrays;
import java.util.Collection;

public class ExampleInstructionStore implements NamedInstructionStore {
	@Override
	public Collection<NamedOperator> getNamedInstructions() {
		return Arrays.asList(
				new NamedOperator("example.instruction", "Pushes 'hello, world' onto the stack") {
					@Override
					public void execute(BlockEvaluator blockEvaluator) {
						blockEvaluator.push(List.fromString("hello, world"));
					}
				}
		);
	}
}
