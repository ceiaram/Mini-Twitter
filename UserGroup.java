import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;

//3. A usergroup has an unique ID, which can be used to group users. A user group can
//contain any number of users. The same user can only be included in one group. Of
//course, a user group can contain other user groups recursively. There is always a root
//group called Root to include everything.

//Uses composite pattern//leaf class
public class UserGroup extends DefaultMutableTreeNode implements TwitterUsers{
	private String id;
	private static int numOfUserGroups = 0;
	private List<User> userGroup;

	public UserGroup(String id){
		super();
		this.id = id;
		this.userGroup = new ArrayList<User>();
		numOfUserGroups ++;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public int getTotalNum() {
		return numOfUserGroups;
	}
	
	/*
	 * Add user to user group list
	 * @param user the user to be added 
	 */
	public void add(User user) {
		userGroup.add(user);
	}


	@Override
	public void totalNum() {
		System.out.println(String.valueOf(getTotalNum()));
	}
	
}
