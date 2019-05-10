package playingAroundWithAbstracts;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

import org.objectweb.asm.*;

public class TestASM implements Opcodes {

	public static byte[] dump() throws Exception {

		ClassWriter cw = new ClassWriter(0);
		FieldVisitor fv;
		MethodVisitor mv;
		AnnotationVisitor av0;

		cw.visit(49,
				ACC_PUBLIC + ACC_SUPER,
				"Hello",
				null,
				"java/lang/Object",
				null);

		cw.visitSource("Hello.java", null);

		{
			mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
			mv.visitVarInsn(ALOAD, 0);
			mv.visitMethodInsn(INVOKESPECIAL,
					"java/lang/Object",
					"<init>",
					"()V", false);
			mv.visitInsn(RETURN);
			mv.visitMaxs(1, 1);
			mv.visitEnd();
		}
		{
			mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC,
					"main",
					"([Ljava/lang/String;)V",
					null,
					null);
			mv.visitFieldInsn(GETSTATIC,
					"java/lang/System",
					"out",
					"Ljava/io/PrintStream;");
			mv.visitLdcInsn("Hello World!");
			mv.visitMethodInsn(INVOKEVIRTUAL,
					"java/io/PrintStream",
					"println",
					"(Ljava/lang/String;)V", false);
			mv.visitInsn(RETURN);
			mv.visitMaxs(2, 1);
			mv.visitEnd();
		}
		cw.visitEnd();

		return cw.toByteArray();
	}
	
	public static void main(String[] args) {
		try {
			byte[] array = TestASM.dump();
			FileOutputStream out = new FileOutputStream("Hello.class");
			out.write(array);
			out.close();
			Class<?> helloClass = new DynamicClassLoader().define("Hello", array);
			Method helloMethod = helloClass.getMethod("main", String[].class);
			helloMethod.invoke(null, (Object) new String[] {});
//			Files.write(Paths.get("hello.class"), array);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static class DynamicClassLoader extends ClassLoader {
		public Class<?> define(String name, byte[] bytecode) {
			return super.defineClass(name, bytecode, 0, bytecode.length);
		}
	};
}