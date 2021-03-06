package authoring.model.collections;

import java.util.ArrayList;
import java.util.List;

import engine.conditions.Condition;
import engine.gameObject.Identifier;

/**
 * @author Kevin Li
 * @author Arjun Jain
 * @author Chris Bernt
 * @author Wesley Valentine
 *
 */
public class ConditionsCollection extends GeneralCollection<Condition> {

	public List<Identifier> getIdentifierList() {
		ArrayList<Identifier> IdList = new ArrayList<Identifier>();
		for (Condition c : this) {
			IdList.add(c.getIdentifier());
		}
		return IdList;
	}

	public void removeByID(String id) {
		for (Condition c : this.myObjects) {
			if (c.getIdentifier().getUniqueId().equals(id)) {
				this.myObjects.remove(c);
				break;
			}
		}
		setChanged();
		notifyObservers(this);
	}

	@Override
	public void add(Condition a) {
		myObjects.add(a);
		setChanged();
		notifyObservers(this);
	}

}
