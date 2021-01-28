import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;


public class ClassLoaderDemo extends ClassLoader{

	
	
	public ClassLoaderDemo(ClassLoader parent) {
	        super(parent);
	 }
	
	public static void main(String[] args) {

	}
	
	public Class loadClass(String name) throws ClassNotFoundException
	{
		System.out.println("Loading Class '" + name + "'");
        if (name.startsWith("CollectionsPack")) {
            System.out.println("Loading Class using CCLoader");
            return getClass(name);
        }
		
		return super.loadClass(name);
	}
	
	
	private Class getClass(String name) throws ClassNotFoundException {
        String file = name.replace('.', File.separatorChar) + ".class";
        byte[] b = null;
        try {
            // This loads the byte code data from the file
            b = loadClassFileData(file);
            // defineClass is inherited from the ClassLoader class
            // that converts byte array into a Class. defineClass is Final
            // so we cannot override it
            Class c = defineClass(name, b, 0, b.length);
            resolveClass(c);
            return c;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
	
    private byte[] loadClassFileData(String name) throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(
                name);
        int size = stream.available();
        byte buff[] = new byte[size];
        DataInputStream in = new DataInputStream(stream);
        in.readFully(buff);
        in.close();
        return buff;
    }
	
}
