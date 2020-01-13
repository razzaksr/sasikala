package spring.each.SasikalaUI.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TnPsc 
{
	private Post post1,post2;

	@Override
	public String toString() {
		return "TnPsc [post1=" + post1 + ", post2=" + post2 + "]";
	}

	public Post getPost1() {
		return post1;
	}

	@Autowired
	public void setPost1(Post post1) {
		this.post1 = post1;
	}

	@Sasikala
	public Post getPost2() {
		return post2;
	}
	
	@Autowired
	public void setPost2(Post post2) {
		this.post2 = post2;
	}
}
