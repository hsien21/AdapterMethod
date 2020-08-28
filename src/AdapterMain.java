
public class AdapterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content = "...";
		Exporter exporter = new ExportUtil();
		
		exporter.export(content);
		
		System.out.println("===========================");
		
		Exporter fileWriterExporter = new WriterAdapter(new FileWriter("file.txt"));
		fileWriterExporter.export(content);
	}
	
}

interface Exporter{
	void export(String content);
}

class ExportUtil implements Exporter{

	@Override
	public void export(String content) {
		// TODO Auto-generated method stub
		System.out.println("export content to somewhere");
	}
	
}

interface Writer{
	void write(byte[] bytes);
}

class FileWriter implements Writer{
	
	private String fileName;
	
	public FileWriter(String fileName) {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
	}

	@Override
	public void write(byte[] bytes) {
		// TODO Auto-generated method stub
		System.out.println("write to" + fileName);
	}
	
}

class WriterAdapter implements Exporter{
	
	private Writer writer;
	
	public WriterAdapter(Writer writer) {
		// TODO Auto-generated constructor stub
		this.writer = writer;
	}

	@Override
	public void export(String content) {
		// TODO Auto-generated method stub
		writer.write(content.getBytes());
	}
	
}
