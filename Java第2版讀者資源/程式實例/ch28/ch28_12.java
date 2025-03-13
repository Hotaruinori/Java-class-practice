import java.awt.*;									// 匯入類別庫
import java.awt.event.*;							// 因為有Event
import java.io.*;									// 檔案讀取
public class ch28_12 {	
	static Frame frm = new Frame("ch28_12");
	static MenuBar mb = new MenuBar();				// 建立MenuBar
	static Menu menu = new Menu("File");			// 建立Menu		
	static MenuItem open = new MenuItem("Open");	// 建立MenuItem
	static FileDialog fd = new FileDialog(frm,"開啟檔案");
	static TextArea ta = new TextArea();
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ActionListener{		// 內部類別
		public void actionPerformed(ActionEvent event) {	// 事件處理者
			MenuItem item = (MenuItem) event.getSource();	// 取得所按選項
			if (item == open) {								// 如果true讀檔案
				fd.setVisible(true);						// 顯示檔案對話方塊
				String fileName = fd.getDirectory()+fd.getFile(); // 所選的檔案
				try {		
					FileInputStream src = new FileInputStream(fileName);					
					byte[] fn = new byte[src.available()];	// 建立fn陣列			
					src.read(fn);				// 從輸入串流讀取資料存入fn陣列
					ta.setText(new String(fn));				// 寫入文字區
					src.close();					
				}			
				catch (IOException e) {
					System.out.println(e);	
				}
			}
		}
	}		
	public static void main(String[] args) {
		mb.add(menu);								// 在MenuBar加入File Menu		
		menu.add(open);								// 將open加入File Menu		
		open.addActionListener(new myListener());	// 註冊
		BorderLayout br = new BorderLayout();		// 版面配置格式
		frm.add(ta,br.CENTER);						// 文字區在中央
		frm.setSize(200, 160);						// 寬200, 高160
		frm.setMenuBar(mb);							// 設定frm功能表是mb物件
		frm.setVisible(true);						// 顯示視窗
	}
}

