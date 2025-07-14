interface Props {
  header: React.ReactNode;
  footer?: React.ReactNode;
  children?: React.ReactNode;
}

export function HomePageLayout({ children, footer, header }: Props) {
  return (
    <div className="border-2 mt-5 flex items-center justify-center flex-col">
      <div className="mb-10">{header}</div>
      {children}
      {footer}
    </div>
  );
}
