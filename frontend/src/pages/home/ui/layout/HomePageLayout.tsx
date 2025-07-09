export default function HomePageLayout({
  header,
  children,
  footer,
}: {
  header: React.ReactNode;
  children: React.ReactNode;
  footer: React.ReactNode;
}) {
  return (
    <div>
      {header}
      {children}
      {footer}
    </div>
  );
}
