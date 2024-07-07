public class LLNode<T> {

	private T data;
	private LLNode<T> link;
	
	public LLNode(T info) {
		data = info;
		link = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public LLNode<T> getLink() {
		return link;
	}

	public void setLink(LLNode<T> link) {
		this.link = link;
	}
	
	

}
