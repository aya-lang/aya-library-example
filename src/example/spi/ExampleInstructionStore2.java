package example.spi;

import aya.eval.BlockEvaluator;
import aya.instruction.named.NamedInstructionStore;
import aya.instruction.named.NamedOperator;
import aya.obj.list.List;

import java.util.Arrays;
import java.util.Collection;

public class ExampleInstructionStore2 implements NamedInstructionStore {
	@Override
	public Collection<NamedOperator> getNamedInstructions() {
		return Arrays.asList(
				new NamedOperator("example.instruction2", "Pushes 'foo bar' onto the stack") {
					@Override
					public void execute(BlockEvaluator blockEvaluator) {
						blockEvaluator.push(List.fromString("foo bar"));
					}
				}
		);
	}
}
