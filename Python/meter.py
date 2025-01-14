import tkinter as tk
from tkinter import ttk

class ProgressMeter:
    def __init__(self, root):
        self.root = root
        self.root.title("Progress Meter")
        self.progress = 0

        self.label = tk.Label(root, text="Task Progress")
        self.label.pack()

        self.progress_var = tk.DoubleVar()
        self.progress_bar = ttk.Progressbar(root, variable=self.progress_var, maximum=100)
        self.progress_bar.pack()

        self.button = tk.Button(root, text="Complete Task", command=self.complete_task)
        self.button.pack()

        # Position the window
        self.position_window()

    def complete_task(self):
        self.progress += 10  # Increase by 10% for each task
        self.progress_var.set(self.progress)
        if self.progress >= 100:
            self.label.config(text="Goal Achieved!")

    def position_window(self):
        # Get screen width and height
        screen_width = self.root.winfo_screenwidth()
        screen_height = self.root.winfo_screenheight()

        # Define window dimensions (keep these as the default dimensions of the window)
        window_width = self.root.winfo_reqwidth()
        window_height = self.root.winfo_reqheight()

        # Calculate position for lower right
        x = screen_width - window_width +60
        y = screen_height - window_height +90

        # Set the geometry of the window
        self.root.geometry(f"+{x}+{y}")

root = tk.Tk()
app = ProgressMeter(root)
root.mainloop()
