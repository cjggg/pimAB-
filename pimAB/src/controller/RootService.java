package controller;

import java.io.File;

public interface RootService {
	int openFile(File file);
	int saveFile(File file);
	int saveAsFile(File file);
}
