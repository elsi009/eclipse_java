package interface5;

public class BoardService extends DBConnect implements CRUD{

	@Override
	public boolean save() {
		System.out.println("게시판 글 저장 완료");
		return false;
	}

	@Override
	public CRUD select() {
		System.out.println("게시글 조회 했다.");
		return null;
	}

	@Override
	public CRUD updatd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
