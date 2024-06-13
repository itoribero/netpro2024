//FacesAWTMain.java
//FacesAWTMain 目標 インナークラスのFaceObjクラスを作ってみよう。描画処理を移譲してください。
//3x3　の顔を描画してください。色などもぬってオリジナルな楽しい顔にしてください。

package guibasic;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FacesAWTMain {

	public static void main(String[] args) {
		new FacesAWTMain();
	}

	FacesAWTMain() {
		FaceFrame f = new FaceFrame();
		f.setSize(800, 800);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}

	// インナークラスを定義
	class FaceFrame extends Frame {


		FaceFrame() {

		}

		public void paint(Graphics g) {
			// この中には、g.drawLine というのは入ってこない
			// Graphicsクラス(型のようなもの---今は--)のgという変数はメソッドに渡す

			// FaceObj fobj= new FaceObj();
			// fobj.drawRim();

			FaceObj[] faces = new FaceObj[9];
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					faces[i] = new FaceObj();
					faces[i].setPosition(i*200 + 100, j*200 + 100);
					faces[i].setEmotionLevel(i * 7, j * 5);
					g.setColor(new Color(0, 0, 255));
					faces[i].drawFace(g);
				}
			}
		}
	}// FaceFrame end

	// Faceクラスを作ってみよう。
	private class FaceObj {
		private int w = 200;
		private int h = 200;
		private int xStart;
		private int yStart;
		private int angryLevel;
		private int smileLevel;

		public void drawRim(Graphics g) { // wが横幅、hが縦幅
			int x = xStart;
			int y = yStart;
			g.drawLine(x, y, x + w, y);
			g.drawLine(x, y, x, y + h);
			g.drawLine(x, y + h, x + w, y + h);
			g.drawLine(x + w, y, x + w, y + h);
		}

		public void drawBrow(Graphics g, int bx) { // xは目の幅 呼ばれる方(=定義する方)
			int x = xStart;
			int y = yStart;
			g.drawLine(x + 45, y + 30, x + 60, y + 30 + angryLevel - smileLevel);
			g.drawLine(x + 135, y + 30 + angryLevel - smileLevel, x + 150, y + 30);
		}

		public void drawNose(Graphics g, int nx) { // xは鼻の長さ
			int x = xStart + 100;
			int y = yStart + 100;
			g.drawLine(x, y, x, y + nx);
		}

		public void drawEye(Graphics g, int r) { // rは目の半径
			g.drawOval(xStart + 45, yStart + 65, r, r);
			g.drawOval(xStart + 120, yStart + 65, r, r);
		}

		public void drawMouth(Graphics g, int mx) { // xは口の幅
			int xMiddle = xStart + w / 2;
			int yMiddle = yStart + h - 30;
			g.drawLine(xMiddle - mx / 2, yMiddle + angryLevel - smileLevel, xMiddle, yMiddle);
			g.drawLine(xMiddle, yMiddle, xMiddle + mx / 2, yMiddle + angryLevel - smileLevel);
		}

		public void drawFace(Graphics g) {
			drawRim(g);
			drawBrow(g, 30);
			drawEye(g, 35);
			drawNose(g, 40);
			drawMouth(g, 100);
		}

		public void setPosition(int x, int y){
			xStart = x;
			yStart = y;
		}

		public void setEmotionLevel(int angry, int smile){
			angryLevel = angry;
			smileLevel = smile;
		}

	}

}// Faces class end
