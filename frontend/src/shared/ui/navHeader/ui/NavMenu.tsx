import { CONVERTER_ROUTES } from "@/shared/lib/constants/pages";
import { LinkLabel } from "@/shared/ui";

export default function NavMenu() {
  return (
    <nav>
      <ul>
        {CONVERTER_ROUTES.map(item => {
          return (
            <LinkLabel key={item.binaryConverter.path} label={item.binaryConverter.label} link={item.binaryConverter.path} />
          )
        })}
      </ul>
    </nav>
  );
}
