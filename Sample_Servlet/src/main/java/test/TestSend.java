package test;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestSend
 */
@WebServlet("/TestSend")
public class TestSend extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public TestSend() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // 日本語が文字化けしないようにUTF-8を指定
    response.setContentType("text/html;charset=UTF-8");

    // TestBean初期化
    // test.TestBean testBean = new test.TestBean();
    TestBean testBean = new TestBean();

    // 入力された値をTestBeanにセットする
    String testvalue1 = request.getParameter("testvalue1");
    testBean.setTestvalue1(testvalue1);
    String testvalue2 = request.getParameter("testvalue2");
    testBean.setTestvalue2(testvalue2);

    // セッションオブジェクトを作成
    HttpSession session = request.getSession(false);

    if (session != null) {
      // セッションオブジェクトがある場合は獲得
      session = request.getSession(false);
    } else {
      // セッションオブジェクトがない場合は新規作成
      session = request.getSession(true);
    }
    // Beansをセッションオブジェクトに保存
    session.setAttribute("testbean", testBean);

    // 遷移先の画面を設定する
    RequestDispatcher rd = null;
    // rd = getServletConfig().getServletContext().getRequestDispatcher("/testScreen.jsp");
    rd = getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/jsp/testScreen.jsp");
    // rd = getServletConfig().getServletContext().getRequestDispatcher("/jsp/testScreen.jsp");
    rd.forward(request, response);
  }

}
