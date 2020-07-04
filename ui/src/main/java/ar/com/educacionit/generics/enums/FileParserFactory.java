package ar.com.educacionit.generics.enums;

import ar.com.educacionit.generics.CSVFileParser;
import ar.com.educacionit.generics.DOCFileParser;
import ar.com.educacionit.generics.TXTFileParser;

public class FileParserFactory {
	
	Object getFileParser(FileTypeEnum type) {
		
		if(type.equals(FileTypeEnum.CSV)) {
			return new CSVFileParser("");
		}else if(type.equals(FileTypeEnum.DOC)) {
			return new DOCFileParser("");
		}else if(type.equals(FileTypeEnum.TXT)){
			return new TXTFileParser("");
		}else {
			return type;
		}
		
	}

}
