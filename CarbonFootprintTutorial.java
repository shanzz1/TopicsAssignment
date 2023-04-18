import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.*;



public class CarbonFootprintTutorial {
    private static final String INTRO_TEXT = "Welcome to the Impacts of Technology tutorial. " +
            "In this tutorial, you will learn about the positive and negative effects of technology!";

    private static final String ENVIRONMENT_TEXT = "Negative impacts of technology on the environment:\n\n" +
            "- Climate change: Technology has contributed significantly to the increase of greenhouse gas emissions, which have led to global warming and climate change.\n" +
            "- Pollution: Technology has also led to the creation of pollution in various forms such as air, water, and land pollution.\n" +
            "- Deforestation: Technology has contributed to deforestation by increasing the demand for timber, paper, and other forest products.\n" +
            "- Electronic waste: The increasing use of electronic devices has led to the creation of electronic waste, which contains hazardous materials that can harm the environment and human health.";

    private static final String CARBON_FOOTPRINT_TEXT = "To calculate your carbon footprint, you need to know how much energy you use in various aspects of your life, such as home energy, transportation, and food. " +
            "Here's a simple formula to calculate your carbon footprint:\n\nTotal CO2e emissions = (Home energy x 0.67) + (Transportation x 0.23) + (Food x 0.1)\n\n" +
            "Note: The coefficients used in the formula are approximate, and your actual carbon footprint may differ depending on your specific circumstances.";

    private static final String HEALTH_TEXT = "Negative impacts of technology on human health:\n\n" +
            "- Eye strain: Spending too much time looking at screens can lead to eye strain, dry eyes, and other vision problems.\n" +
            "- Insomnia: The blue light emitted by screens can disrupt sleep patterns and lead to insomnia.\n" +
            "- Obesity: Sedentary activities such as playing video games and watching TV can contribute to obesity.\n" +
            "- Addiction: Internet and video game addiction can have negative impacts on mental health.";

    private static final String HEALTH_POSITIVE_TEXT = "Positive impacts of technology on human health:\n\n" +
            "- Telemedicine: Technology allows for remote healthcare services, making it easier for people to access medical care.\n" +
            "- Health monitoring: Wearable technology such as fitness trackers can help people monitor their health and stay active.\n" +
            "- Mental health apps: There are various apps available that can help people manage stress, anxiety, and other mental health issues.\n" +
            "- Assistive technology: Technology such as hearing aids and wheelchairs can improve the quality of life for people with disabilities.";

    private static final String EDUCATION_TEXT = "Positive impacts of technology on education:\n\n" +
            "- Online learning: Technology has made it possible to learn from anywhere, anytime, without being physically present in a classroom.\n" +
            "- Increased access: Technology has made education more accessible to people who live in remote areas or who cannot afford traditional education.\n" +
            "- Personalized learning: Technology allows for personalized learning experiences that cater to individual learning styles and needs.\n" +
            "- Collaboration: Technology allows students to collaborate with each other and teachers, regardless of physical location.";

    private static final String WORKPLACE_TEXT = "Positive impacts of technology on the workplace:\n\n" +
    "- Increased productivity: Technology has made it possible for workers to complete tasks more efficiently and accurately.\n" +
    "- Flexible work arrangements: Technology has enabled more people to work remotely, providing flexibility and work-life balance.\n" +
    "- Improved communication: Technology allows for easier and faster communication between coworkers, clients, and customers.\n" +
    "- Automation: Technology can automate repetitive and mundane tasks, allowing workers to focus on more important tasks.";
    public static void main(String[] args) {
      // Create the main frame
      JFrame frame = new JFrame("Impacts of Technology Tutorial");
      frame.setPreferredSize(new Dimension(800, 600));
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
      // Create the main panel
      JPanel mainPanel = new JPanel(new BorderLayout());
  
      // Create the text area for the introduction
      JTextArea introTextArea = new JTextArea(INTRO_TEXT);
      introTextArea.setEditable(false);
      introTextArea.setLineWrap(true);
      introTextArea.setWrapStyleWord(true);
      introTextArea.setCaretPosition(0);
  
      // Create the panel for the buttons
      JPanel buttonPanel = new JPanel();
  
      // Create the button for the environment section
      JButton environmentButton = new JButton("Negative impacts on environment");
      environmentButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              introTextArea.setText(ENVIRONMENT_TEXT);
          }
      });
  
      // Create the button for the carbon footprint section
      JButton carbonFootprintButton = new JButton("Calculate your carbon footprint");
      carbonFootprintButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              introTextArea.setText(CARBON_FOOTPRINT_TEXT);
          }
      });
  
      // Create the button for the health section
      JButton healthButton = new JButton("Negative impacts on health");
      healthButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              introTextArea.setText(HEALTH_TEXT);
          }
      });
  
      // Create the button for the positive health section
      JButton healthPositiveButton = new JButton("Positive impacts on health");
      healthPositiveButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              introTextArea.setText(HEALTH_POSITIVE_TEXT);
          }
      });
  
      // Create the button for the education section
      JButton educationButton = new JButton("Positive impacts on education");
      educationButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              introTextArea.setText(EDUCATION_TEXT);
          }
      });
  
      // Create the button for the workplace section
      JButton workplaceButton = new JButton("Positive impacts on workplace");
      workplaceButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              introTextArea.setText(WORKPLACE_TEXT);
          }
      });
  
      // Add the buttons to the button panel
      buttonPanel.add(environmentButton);
      buttonPanel.add(carbonFootprintButton);
      buttonPanel.add(healthButton);
      buttonPanel.add(healthPositiveButton);
      buttonPanel.add(educationButton);
      buttonPanel.add(workplaceButton);
  
      // Add the introduction text area and the button panel to the main panel
      mainPanel.add(introTextArea, BorderLayout.CENTER);
      mainPanel.add(buttonPanel, BorderLayout.SOUTH);
  
      // Add the main panel to the frame
      frame.add(new JScrollPane(mainPanel));
  
      // Display the frame
      frame.pack();
      frame.setVisible(true);
  }

}
