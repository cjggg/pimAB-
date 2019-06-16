package controller;

import java.io.File;

public class RootServiceImpl implements RootService {
	
	private File file;
	
	public RootServiceImpl() {
		this("member.txt");
	}
	public RootServiceImpl(String filename) {
		file = new File(filename);
	}
	
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	
	@Override
	public int openFile(File file) {
		this.file = file;
		return 0;
	}

	@Override
	public int saveFile(File file) {
		return 0;
	}

	@Override
	public int saveAsFile(File file) {
		return 0;
	}

}	
