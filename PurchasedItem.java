package com.grocery;

public class PurchasedItem {

	private String name;

	private int count;

	public void setName(String name) {
		this.name = name;
	}

	public void setCount(int count) {
		this.count = count;
	}


	public String getName() {
		return name;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "PurchasedItem [name=" + name + ", count=" + count + "]";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PurchasedItem other = (PurchasedItem) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
