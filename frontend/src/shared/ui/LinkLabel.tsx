interface Props {
  label: string;
  link: string;
  className?: string;
}

export function LinkLabel({ label, link, className }: Props) {
  return <a className={className} href={link}>{label}</a>;
}
