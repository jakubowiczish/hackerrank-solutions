import os
import sys


def run():
    main_dir = sys.argv[1]
    directory_name = sys.argv[2]
    link = sys.argv[3]
    prefix = "_" + main_dir
    create_directory_with_readme_file(prefix, directory_name, link)


def create_directory_with_readme_file(prefix, directory_name, link):
    os.chdir("src")
    os.chdir(prefix)
    new_directory_name = directory_name
    os.mkdir(new_directory_name)
    os.chdir(new_directory_name)
    readme_file = open("README.md", "w+")
    readme_file.write("## Solution for problem:\r\n")
    readme_file.write(link)
    readme_file.write("\n\n## Instructions")


if __name__ == "__main__":
    run()
